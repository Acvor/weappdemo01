import React,{ useEffect, useState } from 'react';
import {getStorage, useRouter} from '@tarojs/taro';
import './index.scss'
import {Button, Image, Swiper, SwiperItem, Text, View} from '@tarojs/components';
import Taro from "@tarojs/taro";
import { AtFloatLayout,AtTag,AtInputNumber, AtButton  } from "taro-ui"




function Detail() {
  const router = useRouter();
  const [zcDetail, setSecondLevelMenu] = useState(null);
  const [activeTab, setActiveTab] = useState(0); // 添加activeTab状态变量
  const [isShow,setIsSHow] = useState(false);
  const [value,setValue]=useState(1);


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

  /*页面跳转*/
  const handleCartClick = () => {
    Taro.navigateTo({
      url: '/pages/cart/index',
    });
  };

  const handleCart =() => {
    setIsSHow(true)
  };

// 控制加入购物车浮动窗口

  function handleCartClose() {
    setIsSHow(false)
  }

  const handleChange = (newValue) =>{
    setValue(newValue)
  }
  const handleButton=()=>{
    console.log("传输数据",zcDetail)
    console.log("传输的num：",value)
    const data ={
      zcDetail:zcDetail,
      value:value
    };
    const dataArray =[data];
    Taro.setStorage({
      key:"myData",
      data:JSON.stringify(dataArray)
    })
    setIsSHow(false)
  }





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
        <Text className='price'>￥{zcDetail.price.toFixed(2)}</Text>
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
      {/*底部+弹窗*/}
      <View className='bottom'  >
        <View className='left'>
          <Image src="http://43.139.94.243/icon/index.png" style='height:80rpx;width:90rpx' bindtap="backtoindex"/>
          <Image bindtap="tocart" src="http://43.139.94.243/icon/cart.png" style="height:90rpx;width:90rpx"  onClick={handleCartClick}/>
        </View>
        <view className="right">
          <text onClick={()=>handleCart()} className="textone">加入购物车</text>
          <AtFloatLayout isOpened={isShow} onClose={()=>handleCartClose()}  title="加入购物车">
            <View>
              <image src={zcDetail.src} className="cartImg"></image>
              <View className="cart-bottom">
                <View><Text className="cart-title">{zcDetail.title}</Text></View>
                <View><Text className="cart-prices">￥{zcDetail.price.toFixed(2)}</Text></View>
                <View><Text className="text11">库存：8888</Text></View>
                <View><Text className="text11">已选规格：默认规格，小份</Text></View>
              </View>
              <View className="Detail">
                <Text className="cart-Detail">产品描述</Text>
                <View className="cart-Detail1"><Text className="Detail1">{zcDetail.productDetail}</Text></View>
              </View>
              <View className="test">
                <Text className="test-title">口味</Text>
                <View className="cart-Detail1"><AtTag className="Detail1">默认规格</AtTag></View>
              </View>
              <View className="num">
                <Text className="num-title">购买数量：</Text>
                <AtInputNumber
                    min={1}
                    className="nums"
                    max={100}
                    step={1}
                    value={value}
                    onChange={handleChange}
                />
              </View>
              <AtButton formType='secondary' className="button1" onClick={handleButton}>确 定</AtButton>


            </View>
          </AtFloatLayout>
        </view>

        <view className="right">
          <text className="texttwo">联系客服</text>
        </view>
      </View>

    </View>
  );
}

export default Detail;
