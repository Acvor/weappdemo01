import {Component} from "react";
import {View, Swiper, SwiperItem, Text} from '@tarojs/components'
import './index.scss'
import TabBar from '../common/Index'
import {AtDivider,AtGrid,AtNoticebar } from "taro-ui"
import Taro from "@tarojs/taro";
import { AtImagePicker } from 'taro-ui'


export default class Index extends Component {

  onScrollToUpper() {}

  // or 使用箭头函数
  // onScrollToUpper = () => {}

  onScroll(e){
    console.log(e.detail)
  };
  itemClick = (index) =>{
    console.log(index)
    if (index.value=="充值"){
      Taro.navigateTo({
        url: '/pages/me/index',
      });
    } else if(index.value=="点餐"){
      Taro.navigateTo({
        url: '/pages/catagory/index',
      });
    }

  };




  render() {
      const handlecatagoryClick = () => {
          Taro.navigateTo({
              url: '/pages/catagory/index',
          });
      };
    return (
      <View className='index'>
        <Swiper
          className='swiper'
          indicatorColor='#999'
          indicatorActiveColor='#333'
          vertical={false}
          circular
          indicatorDots
          autoplay
        >
          <SwiperItem className='swiper-item'>
            <image src='https://g2.juntaitec.cn/shouye/1.jpg'></image>
          </SwiperItem>
          <SwiperItem className='swiper-item'>
            <image src='https://g2.juntaitec.cn/shouye/2.jpg'></image>
          </SwiperItem>
          <SwiperItem className='swiper-item'>
            <image src='https://g2.juntaitec.cn/shouye/3.jpg'></image>
          </SwiperItem>
            <SwiperItem className='swiper-item'>
                <image src='https://g2.juntaitec.cn/shouye/4.jpg'></image>
            </SwiperItem>
        </Swiper>
          <AtNoticebar className='text-box' marquee speed='100'>
              快讯：明明早餐店小程序上线啦！！好吃又营养！！
          </AtNoticebar>
          <AtGrid  columnNum='2' onClick={this.itemClick.bind(this)} data={
              [
                  {
                      image: 'https://g2.juntaitec.cn/dc.jpg',
                      value: '点餐'
                  },
                  {
                      image: 'https://g2.juntaitec.cn/cz.jpg',
                      value: '充值'
                  },
              ]
          } />
          <text className='text1'>推荐营养早餐</text>
          <View className='zcImage'>
              <image src='https://g2.juntaitec.cn/zcc/zc113.jpg'></image>
              <image src='https://g2.juntaitec.cn/zcc/zc112.jpg'></image>
              <image src='https://g2.juntaitec.cn/zcc/zc111.jpg'></image>
          </View>

        <TabBar current={0}/>

      </View>

    )
  }
}
