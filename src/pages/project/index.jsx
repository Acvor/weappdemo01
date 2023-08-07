import {View} from '@tarojs/components'
import './index.scss'
import {Component} from "react";
import Taro from "@tarojs/taro";
import {AtTabs, AtTabsPane} from "taro-ui";

export default class Index extends Component {
  constructor() {
    super();
    this.state={
      current: ''
    }
  }

  handleClick (value) {
    this.setState({
      current: value
    })
  }

  render(){
    const tabList = [{ title: '商品详情' }, { title: '产品参数' }]
    let Current = Taro.getCurrentInstance();
    let data = JSON.parse(decodeURIComponent(Current.router.params.data));
    return (
      <View>
        {/*商品展示*/}
        <swiper class='swiper' indicatorDots autoplay interval="3000">
          <swiper-item>
            <image src={data.imageOne} />
          </swiper-item>
          <swiper-item>
            <image src={data.imageTwo} />
          </swiper-item>
          <swiper-item>
            <image src={data.imageThree} />
          </swiper-item>
        </swiper>
        {/*商品标题价格*/}
        <view className='box-demo'>
          <text className='title'>{data.title} {data.secondtitle}</text>
          <text className='price'>￥{data.price}</text>
        </view>
        {/*商品详情展示*/}
        <AtTabs current={this.state.current} tabList={tabList} onClick={this.handleClick.bind(this)} className='fix'>
          <AtTabsPane current={this.state.current} index={0}>
            {/*<View style='padding: 100px 50px;background-color: #FAFBFC;text-align: center;' >{skl.productDetail}</View>*/}
            <image className='fix-box' src={data.productDetail}/>
          </AtTabsPane>
          <AtTabsPane current={this.state.current} index={1}>
            <image className='fix-box-2' src={data.productParameter}/>
          </AtTabsPane>
        </AtTabs>

        <view className="bottom">
          <view className="left">
            <image className="" style='height:80rpx;width:90rpx' bindtap="backtoindex"/>
            <image className="tocart" src="http://43.139.94.243/icon/cart.png" style="height:90rpx;width:90rpx"/>
          </view>
          <view className="right">
            <text className="textOne" bindtap="addcart" data-id={data.id} data-title={data.title}
                  data-price={data.price} data-image={data.image}>加入购物车</text>
          </view>
          <view className="right">
            <text className="textTwo">联系客服</text>
          </view>
        </view>
      </View>
    )
  }
}
