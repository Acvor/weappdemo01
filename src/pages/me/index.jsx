import { View, Text } from '@tarojs/components'
import { useLoad } from '@tarojs/taro'
import './index.scss'
import TabBar from "../common/Index";

export default function Index() {

  useLoad(() => {
    console.log('Page loaded.')
  })

  return (
    <View className='me'>
      <Text>这是我的页面</Text>
      <TabBar current={3}></TabBar>
    </View>
  )
}
