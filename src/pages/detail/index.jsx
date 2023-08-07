import { useEffect, useState } from 'react';
import { AtTabs, AtTabsPane } from 'taro-ui'
import { useRouter } from '@tarojs/taro';
import './index.scss'
import {Image, Swiper, SwiperItem, Text, View} from '@tarojs/components';
import Taro from "@tarojs/taro";


function Detail() {
  const router = useRouter();
  const [zcDetail, setSecondLevelMenu] = useState(null);
  const [activeTab, setActiveTab] = useState(0); // 添加activeTab状态变量


  useEffect(() => {
    // 打印从路由获取的zcDetail的数据
    console.log('product的内容是:', router.params.zcDetail);
    const secondLevelMenuString = decodeURIComponent(router.params.zcDetail);
    const parsedSecondLevelMenu = JSON.parse(secondLevelMenuString);

    console.log('接收到的数据:', parsedSecondLevelMenu);

    setSecondLevelMenu(parsedSecondLevelMenu); // 设置商品数据到状态

    return () => {
      setSecondLevelMenu(null); // 在组件卸载时清空商品数据
    };
  }, [router.params.zcDetail]);

  useEffect(() => {
    console.log('设置商品数据:', zcDetail);
  }, [zcDetail]);

  if (!zcDetail) {
    return <p>Loading...</p>; // 如果商品数据为空，可以返回一个加载中的状态
  }

  const switchTab = (index) => {
    setActiveTab(index); // 更新activeTab的值
  };

  const handleCartClick = () => {
    Taro.navigateTo({
      url: '/pages/cart/index',
    });
  };


  return (
    // 商品详情页面的内容
    <View>
      <Swiper
        indicatorDots
        autoplay
        interval={3000}
      >
        <SwiperItem>
          <Image src={zcDetail.imageOne} />
        </SwiperItem>
        <SwiperItem>
          <Image src={zcDetail.imageTwo} />
        </SwiperItem>
        <SwiperItem>
          <Image src={zcDetail.imageThree} />
        </SwiperItem>
      </Swiper>

      <View className='box-demo'>
        <Text className='title'>{zcDetail.title} {zcDetail.secondtitle}</Text>
        <Text className='price'>￥{zcDetail.price}</Text>
      </View>

      <View className='textDetail'>
        <text className='text'>{zcDetail.productDetail}</text>
      </View>

      <View>
        <View className='tab' onClick={() => switchTab(0)}>
         商品描述
        </View>
        <Image src={zcDetail.src} mode='widthFix' className='fix-box' />
      </View>




      <View className='bottom'  onClick={handleCartClick}>
        <View className='left'>
          <Image src="http://43.139.94.243/icon/index.png" style='height:80rpx;width:90rpx' bindtap="backtoindex"/>
          <Image bindtap="tocart" src="http://43.139.94.243/icon/cart.png" style="height:90rpx;width:90rpx"/>
        </View>
        <view className="right">
          <text className="textone" bindtap="addcart" data-id="{{data.id}}" data-title="{{data.title}}"
                data-price="{{data.price}}" data-image="{{data.image}}">加入购物车
          </text>
        </view>
        <view className="right">
          <text className="texttwo">联系客服</text>
        </view>
      </View>

    </View>
  );
}

export default Detail;
