import {Component} from "react";
import {View, Swiper, SwiperItem, Text} from '@tarojs/components'
import './index.scss'
import TabBar from '../common/Index'
import { AtGrid } from "taro-ui"
import Taro from "@tarojs/taro";


export default class Index extends Component {

  onScrollToUpper() {}

  // or 使用箭头函数
  // onScrollToUpper = () => {}

  onScroll(e){
    console.log(e.detail)
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
          <AtGrid  columnNum='2' onClick={handlecatagoryClick} data={
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
        <TabBar current={0}/>

      </View>

    )
  }
}
