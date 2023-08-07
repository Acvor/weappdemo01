import { View, Text } from '@tarojs/components'
import { useLoad } from '@tarojs/taro'
import TabBar from '../common/Index'

export default function Index() {

  useLoad(() => {
    console.log('Page loaded.')
  })

  return (
    <View className='cart'>
      <Text>购物车界面</Text>
      <TabBar current={2}></TabBar>
    </View>
  )
}
