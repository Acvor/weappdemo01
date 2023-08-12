import './index.scss'
import {Component} from "react";
import {Checkbox, CheckboxGroup, Icon, Image, Navigator, Text, View} from "@tarojs/components";
import TabBar from "../common/Index";
import Taro from '@tarojs/taro';

export default class Index extends Component {
  //定义变量
  constructor() {
    super();
    this.state = {
      carts: [


      ], // 购物车列表
      hascheckList: [],
      totalPrice: 0, // 总价，初始为0
      selectAllStatus: false // 全选状态，默认全选
    }

  }
  //初始化函数
  componentDidMount() {
    console.log(this.state.carts)
    let _this = this;
    Taro.getStorage({
      key: 'myData',
      success: function (res) {
        const arrayData = JSON.parse(res.data); // 将字符串转换为数组
        _this.setState({
          carts:arrayData

        })
        console.log('获取数组数据成功', arrayData);
      },
      fail: function (error) {
        console.log('获取数组数据失败', error);
      }
    });
    console.log(this.state.carts)
  }

  //自定义函数
  /**
   * 计算总价
   */
  getTotalPrice() {
    let carts = this.state.carts // 获取购物车列表
    let total = 0
    for (let i = 0; i < carts.length; i++) {
      // 循环列表得到每个数据
      if (carts[i].selected) {
        // 判断选中才会计算价格
        total += carts[i].num * carts[i].price // 所有价格加起来
      }
    }
    this.setState({
      // 最后赋值到data中渲染到页面
      carts: carts,
      totalPrice: total.toFixed(2)
    })
  }


  /**
   * 绑定加数量事件
   */
  addCount(carts, e) {
    const index = e.currentTarget.dataset.index
    let num = carts[index].num
    num = num + 1
    carts[index].num = num
    this.setState({
      carts: carts
    })
    this.getTotalPrice()
  }

  /**
   * 绑定减数量事件
   */
  minusCount(carts, e) {
    const index = e.currentTarget.dataset.index
    let num = carts[index].num
    if (num <= 1) {
      return false
    }
    num = num - 1
    carts[index].num = num
    this.setState({
      carts: carts
    })
    this.getTotalPrice()
  }

  /**
   * 删除购物车当前商品
   */
  deleteList(carts, e) {
    const index = e.currentTarget.dataset.index
    carts.splice(index, 1)
    this.setState({
      carts: carts
    })
    if (!carts.length) {
      this.setState({
        hasList: false
      })
    } else {
      this.getTotalPrice()
    }
  }

  /**
   * 当前商品选中事件
   */
  selectList(id, e) {
    const index = e.currentTarget.dataset.index
    let carts = this.state.carts
    // const selected = carts[index].selected
    // carts[index].selected = !selected

    carts.forEach(item => {
      if (id == item.id) {
        item.selected = !item.selected
      }
    })
    // const checkall = this.data.selectAllStatus === true ? false : false
    this.setState({
      carts: carts,
      // selectAllStatus: false
    })

    const selectAllStatus = carts.every(item => item.selected)
    this.setState({
      selectAllStatus: selectAllStatus
    })
    this.getTotalPrice()
  }

  /**
   * 购物车全选事件
   */
  selectAll(carts, e) {
    let selectAllStatus = this.state.selectAllStatus
    selectAllStatus = !selectAllStatus
    for (let i = 0; i < carts.length; i++) {
      carts[i].selected = selectAllStatus
    }
    this.setState({
      selectAllStatus: selectAllStatus,
      carts: carts
    })
    this.getTotalPrice()
  }

  // 结算
  closeFun(carts) {
    let list = []
    let listTotal = []
    carts.map((v, k) => {
      console.log('购物车数据', v)
      if (v.select) {
        list.push(v)
      } else {
        listTotal.push(v)
      }
    })
  }


  componentDidShow() {
    const cart = []
    this.setState({
      carts: cart
    })
    this.getTotalPrice();
  }

  //返回元素
  render() {
    const {carts, selectAllStatus, totalPrice, hasList} = this.state;
    let count = 0;
    carts.map(it => {
      if (it.selected === true) {
        count++;
      }
    })

    return (
      <View className="main">
        {carts.length > 0 ? (
          <View className="cart">
            <View className="cart-box">
              {this.state.carts.map((item, index) => {
                return (
                  <View className="cart-list" key={index}>
                    {item.selected ? (
                      <Icon
                        type="success"
                        color="#b30000"
                        data-index={index}
                        className="cart-pro-select"
                        onClick={this.selectList.bind(this, item.id)}
                      />
                    ) : (
                      <Icon
                        type="circle"
                        className="cart-pro-select"
                        data-index={index}
                        onClick={this.selectList.bind(this, item.id)}
                      />
                    )}
                    <Navigator url={'../details/details?id=' + item.id}>
                      <Image className="cart-thumb" src={item.image}/>
                    </Navigator>
                    <Text className="cart-pro-name">{item.title}</Text>
                    <Text className="cart-pro-price">{'￥' + item.price}</Text>
                    <View className="cart-count-box">
                      <Text
                        className="cart-count-down"
                        onClick={this.minusCount.bind(this, this.state.carts)}
                        data-index={index}
                      >
                        -
                      </Text>
                      <Text className="cart-count-num">{item.num}</Text>
                      <Text
                        className="cart-count-add"
                        onClick={this.addCount.bind(this, this.state.carts)}
                        data-index={index}
                      >
                        +
                      </Text>
                    </View>
                    <Text
                      className="cart-del"
                      onClick={this.deleteList.bind(this, this.state.carts)}
                      data-index={index}
                    >
                      删除
                    </Text>
                  </View>
                )
              })}
            </View>
            <View className="cart-footer">

              {selectAllStatus ? (
                <Icon
                  type="success_circle"
                  color="#b30000"
                  className="total-select"
                  onClick={this.selectAll.bind(this, this.state.carts)}
                />
              ) : (
                <Icon
                  type="circle"
                  color="#b30000"
                  className="total-select"
                  onClick={this.selectAll.bind(this, this.state.carts)}
                />
              )}
              <Navigator url="../orders/orders">
                <View className="order-icon"/>
              </Navigator>
              <Text>{this.count > 0 ? `已选(${this.count})` : '全选'}</Text>
              <Text className="cart-total-price">{'合计￥' + totalPrice}</Text>
              <Text className="pay" onClick={this.closeFun.bind(this, this.state.carts)} data-index={this.index}>
                立即下单
              </Text>
            </View>
          </View>
        ) : (
          <View>
            <View className="cart-no-data">购物车是空的哦~</View>
          </View>
        )}
        <TabBar current={2}/>

      </View>

    )
  }
}
