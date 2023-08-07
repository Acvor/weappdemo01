import {Component} from "react";
import {View} from "@tarojs/components"
import { AtTabBar } from 'taro-ui'
import Taro from "@tarojs/taro";

export default class Index extends Component{


  handleClick(current) {
    // 跳转
    if (current == 0) {
      Taro.reLaunch({
        url: '/pages/index/index'
      })
    } else if (current == 1) {
      Taro.reLaunch({
        url: '/pages/catagory/index'
      })
    } else if (current == 2) {
      Taro.reLaunch({
        url: '/pages/cart/index'
      })
    } else if (current == 3) {
      Taro.reLaunch({
        url: '/pages/me/index'
      })
    }
  }

  render() {
    let BATE_URL='http://43.139.94.243/icon';
    return(
      <View className='index'>
        <AtTabBar
          fixed
          tabList={[
            { title: '首页', image: `${BATE_URL}/index.png`, selectedImage: `${BATE_URL}/index0.png`},
            { title: '分类', image: `${BATE_URL}/sort.png`, selectedImage: `${BATE_URL}/sort0.png`},
            { title: '购物车', image: `${BATE_URL}/cart.png`, selectedImage: `${BATE_URL}/cart0.png`},
            { title: '我的', image: `${BATE_URL}/me.png`, selectedImage: `${BATE_URL}/me0.png`}
          ]}
          onClick={this.handleClick.bind(this)}
          current={this.props.current}
        />
      </View>
    )
  }
}
