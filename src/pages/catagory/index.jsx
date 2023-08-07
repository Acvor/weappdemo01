import {Image, Text, View} from '@tarojs/components';
import TabBar from "../common/Index";
import './index.scss'
import {AtTabs, AtTabsPane} from "taro-ui";
import {Component} from "react";
import Taro from "@tarojs/taro";


export default class Index extends Component{

  handleProductClick(secondLevelMenu){
    console.log("点击图片id:",secondLevelMenu.id)
    console.log("商品信息：",secondLevelMenu)

    Taro.navigateTo({
      url: '/pages/detail/index?zcDetail='+JSON.stringify(secondLevelMenu),
    })
  }


  constructor() {
    super();
    this.state = {
      current: 0,
      // 侧边栏数据
      firstCategoryArr: [
        {id: 0, title: "全部"},
        {id: 1, title: "凉皮"},
        {id: 2, title: "花样包点"},
        {id: 3, title: "门店特色"}
      ],
      // 商品数据
      secondCategoryArr: []
    }
  }

  handleClick(index){
    console.log(index);
    this.setState({
      current: index
    })
  }

  componentDidMount(){
    let _this=this;
    Taro.request({
      url: 'https://g2.juntaitec.cn/api/productList', //必须为域名
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function (res) {
        console.log("数据：",res);
        _this.setState({
          secondCategoryArr: res.data.data
        })
      }
    })
  }

  render(){
    let br='\n'

    return (
      <View className='catagory'>
        <AtTabs
          current={this.state.current}
          scroll
          height='900px'
          tabDirection='vertical'
          tabList={this.state.firstCategoryArr}
          onClick={this.handleClick.bind(this)}
        >
          {
            this.state.firstCategoryArr.map((firstLevelMenu)=> {
              return(
                <AtTabsPane tabDirection='vertical' current={this.state.current} index={0} className='tabsPane'>
                  {
                    this.state.secondCategoryArr.map((secondLevelMenu)=>{
                      if(firstLevelMenu.id==0){
                        return(
                          <view className='paneContent' onClick={()=>this.handleProductClick(secondLevelMenu)}>
                            <Image style='height: 80px;width: 80px' src={secondLevelMenu.src} className="img"></Image>
                            <Text className="secondTitle">{secondLevelMenu.title}</Text>
                            <View className='text'>
                              <Text className="price">￥{secondLevelMenu.price}</Text>
                              <Text className="sold">卖了114514件</Text>
                              <Image src='http://43.139.94.243/icon/cart.png' className="cart"></Image>
                            </View>
                          </view>
                        )
                      } else if(secondLevelMenu.parentId==firstLevelMenu.id){
                        return(
                          <view className='paneContent' onClick={()=>this.handleProductClick(secondLevelMenu)}>
                            <Image style='height: 80px;width: 80px' src={secondLevelMenu.src} className="img"></Image>
                            <Text className="secondTitle">{secondLevelMenu.title}</Text>
                            <Text className='text'>
                              <Text className="price">￥{secondLevelMenu.price}</Text>
                              <Text className="sold">卖了114514件</Text>
                            </Text>
                            <Image src='http://43.139.94.243/icon/cart.png' className="cart"></Image>
                          </view>
                        )
                      }
                    })
                  }
                </AtTabsPane>
              )
            })
          }
        </AtTabs>
        <TabBar current={1}></TabBar>
      </View>
    )
  }
}
