"use strict";
(wx["webpackJsonp"] = wx["webpackJsonp"] || []).push([["common"],{

/***/ "./src/pages/common/Index.js":
/*!***********************************!*\
  !*** ./src/pages/common/Index.js ***!
  \***********************************/
/***/ (function(__unused_webpack_module, __webpack_exports__, __webpack_require__) {

/* harmony export */ __webpack_require__.d(__webpack_exports__, {
/* harmony export */   "default": function() { return /* binding */ Index; }
/* harmony export */ });
/* harmony import */ var F_weappdemo01_node_modules_babel_runtime_helpers_esm_classCallCheck_js__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./node_modules/@babel/runtime/helpers/esm/classCallCheck.js */ "./node_modules/@babel/runtime/helpers/esm/classCallCheck.js");
/* harmony import */ var F_weappdemo01_node_modules_babel_runtime_helpers_esm_createClass_js__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./node_modules/@babel/runtime/helpers/esm/createClass.js */ "./node_modules/@babel/runtime/helpers/esm/createClass.js");
/* harmony import */ var F_weappdemo01_node_modules_babel_runtime_helpers_esm_inherits_js__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./node_modules/@babel/runtime/helpers/esm/inherits.js */ "./node_modules/@babel/runtime/helpers/esm/inherits.js");
/* harmony import */ var F_weappdemo01_node_modules_babel_runtime_helpers_esm_createSuper_js__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./node_modules/@babel/runtime/helpers/esm/createSuper.js */ "./node_modules/@babel/runtime/helpers/esm/createSuper.js");
/* harmony import */ var react__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! react */ "webpack/container/remote/react");
/* harmony import */ var react__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(react__WEBPACK_IMPORTED_MODULE_0__);
/* harmony import */ var _tarojs_components__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! @tarojs/components */ "./node_modules/@tarojs/plugin-platform-weapp/dist/components-react.js");
/* harmony import */ var taro_ui__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! taro-ui */ "webpack/container/remote/taro-ui");
/* harmony import */ var taro_ui__WEBPACK_IMPORTED_MODULE_1___default = /*#__PURE__*/__webpack_require__.n(taro_ui__WEBPACK_IMPORTED_MODULE_1__);
/* harmony import */ var _tarojs_taro__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @tarojs/taro */ "webpack/container/remote/@tarojs/taro");
/* harmony import */ var _tarojs_taro__WEBPACK_IMPORTED_MODULE_2___default = /*#__PURE__*/__webpack_require__.n(_tarojs_taro__WEBPACK_IMPORTED_MODULE_2__);
/* harmony import */ var react_jsx_runtime__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! react/jsx-runtime */ "webpack/container/remote/react/jsx-runtime");
/* harmony import */ var react_jsx_runtime__WEBPACK_IMPORTED_MODULE_3___default = /*#__PURE__*/__webpack_require__.n(react_jsx_runtime__WEBPACK_IMPORTED_MODULE_3__);









var Index = /*#__PURE__*/function (_Component) {
  (0,F_weappdemo01_node_modules_babel_runtime_helpers_esm_inherits_js__WEBPACK_IMPORTED_MODULE_4__["default"])(Index, _Component);
  var _super = (0,F_weappdemo01_node_modules_babel_runtime_helpers_esm_createSuper_js__WEBPACK_IMPORTED_MODULE_5__["default"])(Index);
  function Index() {
    (0,F_weappdemo01_node_modules_babel_runtime_helpers_esm_classCallCheck_js__WEBPACK_IMPORTED_MODULE_6__["default"])(this, Index);
    return _super.apply(this, arguments);
  }
  (0,F_weappdemo01_node_modules_babel_runtime_helpers_esm_createClass_js__WEBPACK_IMPORTED_MODULE_7__["default"])(Index, [{
    key: "handleClick",
    value: function handleClick(current) {
      // 跳转
      if (current == 0) {
        _tarojs_taro__WEBPACK_IMPORTED_MODULE_2___default().reLaunch({
          url: '/pages/index/index'
        });
      } else if (current == 1) {
        _tarojs_taro__WEBPACK_IMPORTED_MODULE_2___default().reLaunch({
          url: '/pages/catagory/index'
        });
      } else if (current == 2) {
        _tarojs_taro__WEBPACK_IMPORTED_MODULE_2___default().reLaunch({
          url: '/pages/cart/index'
        });
      } else if (current == 3) {
        _tarojs_taro__WEBPACK_IMPORTED_MODULE_2___default().reLaunch({
          url: '/pages/me/index'
        });
      }
    }
  }, {
    key: "render",
    value: function render() {
      var BATE_URL = 'http://43.139.94.243/icon';
      return /*#__PURE__*/(0,react_jsx_runtime__WEBPACK_IMPORTED_MODULE_3__.jsx)(_tarojs_components__WEBPACK_IMPORTED_MODULE_8__.View, {
        className: "index",
        children: /*#__PURE__*/(0,react_jsx_runtime__WEBPACK_IMPORTED_MODULE_3__.jsx)(taro_ui__WEBPACK_IMPORTED_MODULE_1__.AtTabBar, {
          fixed: true,
          tabList: [{
            title: '首页',
            image: "".concat(BATE_URL, "/index.png"),
            selectedImage: "".concat(BATE_URL, "/index0.png")
          }, {
            title: '分类',
            image: "".concat(BATE_URL, "/sort.png"),
            selectedImage: "".concat(BATE_URL, "/sort0.png")
          }, {
            title: '购物车',
            image: "".concat(BATE_URL, "/cart.png"),
            selectedImage: "".concat(BATE_URL, "/cart0.png")
          }, {
            title: '我的',
            image: "".concat(BATE_URL, "/me.png"),
            selectedImage: "".concat(BATE_URL, "/me0.png")
          }],
          onClick: this.handleClick.bind(this),
          current: this.props.current
        })
      });
    }
  }]);
  return Index;
}(react__WEBPACK_IMPORTED_MODULE_0__.Component);


/***/ })

}]);
//# sourceMappingURL=common.js.map