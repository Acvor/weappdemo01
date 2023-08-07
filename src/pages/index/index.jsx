import {Component} from "react";
import {View, Swiper, SwiperItem, ScrollView, Text} from '@tarojs/components'
import './index.scss'
import TabBar from "../common/Index";
import Taro from "@tarojs/taro";

export default class Index extends Component {

  constructor() {
    super();
    this.state={
      productList: [],
    }
  }

  componentDidMount() {
    let _this=this;
    Taro.request({
      url: 'https://676fn98390.goho.co/productList', //必须为域名
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function (res) {
        _this.setState({
          productList: res.data.data
        })
      }
    })
  }

  onScrollToUpper() {}

  // or 使用箭头函数
  // onScrollToUpper = () => {}

  onScroll(e){
    console.log(e.detail)
  }

  projectText(){
    // 跳转
    let data = JSON.stringify(this)
    Taro.reLaunch({
      url: '/pages/project/index?data=' + encodeURIComponent(data),
    })
  }

  render(){
    const scrollTop = 0
    const Threshold = 20

    return (
      <View className='index'>
        {/*轮播图*/}
        <Swiper
          className='swiper'
          indicatorColor='#999'
          indicatorActiveColor='#333'
          vertical={false}
          circular
          indicatorDots
          autoplay>
          <SwiperItem className='item'>
            <image src='http://43.139.94.243/images/ban1.jpg'></image>
          </SwiperItem>
          <SwiperItem className='item'>
            <image src='http://43.139.94.243/images/ban2.jpg'></image>
          </SwiperItem>
          <SwiperItem className='item'>
            <image src='http://43.139.94.243/images/ban3.jpg'></image>
          </SwiperItem>
        </Swiper>
        {/*商品信息*/}
        <ScrollView
          className='scrollview'
          scrollY
          enableFlex='true'
          scrollWithAnimation
          scrollTop={scrollTop}
          lowerThreshold={Threshold}
          upperThreshold={Threshold}
          onScrollToUpper={this.onScrollToUpper.bind(this)} // 使用箭头函数的时候 可以这样写 `onScrollToUpper={this.onScrollToUpper}`
          onScroll={this.onScroll}
        >
          {
            this.state.productList.map((product)=>{
              return(
                <View className='goods-box' onClick={this.projectText.bind(product)}>
                  <image className='goods-pic' src={product.src}></image>
                  <View className='goods-title'>{product.title}</View>
                  <View className='goods-titleTow'>{product.secondtitle}</View>
                  <View className='row'>
                    <View className='goods-price'>{product.price}</View>
                    <Text className='goods-btn'>看相似</Text>
                  </View>
                </View>
              )
            })
          }
        </ScrollView>
        <TabBar current={0}></TabBar>
      </View>
    )
  }
}
