import {View, Text, Button} from '@tarojs/components'
import Taro, { useLoad } from '@tarojs/taro'
import './index.scss'
import TabBar from '../common/Index'
import { AtTabBar } from 'taro-ui'
import {Component} from "react";
import { AtGrid } from "taro-ui"
import { AtAvatar } from 'taro-ui'
import {  AtModal, AtModalHeader, AtModalContent, AtModalAction, AtButton } from 'taro-ui'
import 'taro-ui/dist/style/index.scss';

export default class Index extends Component {

  constructor () {
    super()
    this.state = {
      current: 0,
      payIsOpend: false
    }
    this.payClick = this.payClick.bind(this)
  }
  handleClick (value) {
    if (value==0){
      Taro.navigateTo({
        url: '/pages/cart/index',
      });
    } else if(value==1){
      console.log("收藏界面敬请期待！")
    } else if (value==2){
      console.log("红包卡券界面也敬请期待！")
    }
  }
  itemClick = (index) =>{
    console.log(index.value+"敬请期待！")
  };
  payClick(){
    console.log("点击充值")
    this.setState({
      payIsOpend: true
    })
  }

  render() {
    return (
      <View className='me'>
        <View>
          <View className='infomation'>
            <AtAvatar className='headImage' size='large' circle image='https://g2.juntaitec.cn/head.png'></AtAvatar>
            <Text className='headName' >明明会不会</Text>
          </View>
          <AtButton type='primary' onClick={this.payClick}>充值</AtButton>
          <AtModal className='payAtModal' isOpened={this.state.payIsOpend}>
            <AtModalHeader>充值界面</AtModalHeader>
            <AtModalContent>
              <image style='height:300px;width:300px;' src="https://g2.juntaitec.cn/pay.jpg"></image>
            </AtModalContent>
            <AtModalAction> <Button>好的</Button> <Button>好的</Button> </AtModalAction>
          </AtModal>
          <AtTabBar className='meAttabbar'
            tabList={[
              {
                title: '购物车',
                image: 'https://g2.juntaitec.cn/me/cart.png',
                max: 99
              },
              {
                title: '收藏',
                image: 'https://g2.juntaitec.cn/me/collect.png'
              },
              {
                title: '红包卡券',
                image: 'https://g2.juntaitec.cn/me/card.png',
                text: 'new'
              }
            ]}
            onClick={this.handleClick.bind(this)}
            current={this.state.current}
          />
          <AtGrid mode='rect' onClick={this.itemClick.bind(this)} data={
            [
              {
                image: 'https://img12.360buyimg.com/jdphoto/s72x72_jfs/t6160/14/2008729947/2754/7d512a86/595c3aeeNa89ddf71.png',
                value: '领取中心'
              },
              {
                image: 'https://img20.360buyimg.com/jdphoto/s72x72_jfs/t15151/308/1012305375/2300/536ee6ef/5a411466N040a074b.png',
                value: '找折扣'
              },
              {
                image: 'https://img10.360buyimg.com/jdphoto/s72x72_jfs/t5872/209/5240187906/2872/8fa98cd/595c3b2aN4155b931.png',
                value: '领会员'
              },
              {
                image: 'https://img12.360buyimg.com/jdphoto/s72x72_jfs/t10660/330/203667368/1672/801735d7/59c85643N31e68303.png',
                value: '新品首发'
              },
              {
                image: 'https://img14.360buyimg.com/jdphoto/s72x72_jfs/t17251/336/1311038817/3177/72595a07/5ac44618Na1db7b09.png',
                value: '领京豆'
              },
              {
                image: 'https://img30.360buyimg.com/jdphoto/s72x72_jfs/t5770/97/5184449507/2423/294d5f95/595c3b4dNbc6bc95d.png',
                value: '手机馆'
              }
            ]
          } />
        </View>
        <TabBar current={3}></TabBar>
      </View>
    )
  }
}
