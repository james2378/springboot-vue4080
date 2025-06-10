import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Storeup from '../pages/storeup/list'
import AddrList from '../pages/shop-address/list'
import AddrAdd from '../pages/shop-address/addOrUpdate'
import Order from '../pages/shop-order/list'
import OrderConfirm from '../pages/shop-order/confirm'
import Cart from '../pages/shop-cart/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import shangjiaList from '../pages/shangjia/list'
import shangjiaDetail from '../pages/shangjia/detail'
import shangjiaAdd from '../pages/shangjia/add'
import shangpinfenleiList from '../pages/shangpinfenlei/list'
import shangpinfenleiDetail from '../pages/shangpinfenlei/detail'
import shangpinfenleiAdd from '../pages/shangpinfenlei/add'
import ershoushangpinList from '../pages/ershoushangpin/list'
import ershoushangpinDetail from '../pages/ershoushangpin/detail'
import ershoushangpinAdd from '../pages/ershoushangpin/add'
import zaixianjiaoliuList from '../pages/zaixianjiaoliu/list'
import zaixianjiaoliuDetail from '../pages/zaixianjiaoliu/detail'
import zaixianjiaoliuAdd from '../pages/zaixianjiaoliu/add'
import shangjiahuifuList from '../pages/shangjiahuifu/list'
import shangjiahuifuDetail from '../pages/shangjiahuifu/detail'
import shangjiahuifuAdd from '../pages/shangjiahuifu/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import discussershoushangpinList from '../pages/discussershoushangpin/list'
import discussershoushangpinDetail from '../pages/discussershoushangpin/detail'
import discussershoushangpinAdd from '../pages/discussershoushangpin/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'storeup',
					component: Storeup
				},
                {
                    path: 'shop-address/list',
                    component: AddrList
                },
                {
                    path: 'shop-address/addOrUpdate',
                    component: AddrAdd
                },
				{
					path: 'shop-order/order',
					component: Order
				},
				{
					path: 'cart',
					component: Cart
				},
				{
					path: 'shop-order/orderConfirm',
					component: OrderConfirm
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'shangjia',
					component: shangjiaList
				},
				{
					path: 'shangjiaDetail',
					component: shangjiaDetail
				},
				{
					path: 'shangjiaAdd',
					component: shangjiaAdd
				},
				{
					path: 'shangpinfenlei',
					component: shangpinfenleiList
				},
				{
					path: 'shangpinfenleiDetail',
					component: shangpinfenleiDetail
				},
				{
					path: 'shangpinfenleiAdd',
					component: shangpinfenleiAdd
				},
				{
					path: 'ershoushangpin',
					component: ershoushangpinList
				},
				{
					path: 'ershoushangpinDetail',
					component: ershoushangpinDetail
				},
				{
					path: 'ershoushangpinAdd',
					component: ershoushangpinAdd
				},
				{
					path: 'zaixianjiaoliu',
					component: zaixianjiaoliuList
				},
				{
					path: 'zaixianjiaoliuDetail',
					component: zaixianjiaoliuDetail
				},
				{
					path: 'zaixianjiaoliuAdd',
					component: zaixianjiaoliuAdd
				},
				{
					path: 'shangjiahuifu',
					component: shangjiahuifuList
				},
				{
					path: 'shangjiahuifuDetail',
					component: shangjiahuifuDetail
				},
				{
					path: 'shangjiahuifuAdd',
					component: shangjiahuifuAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'discussershoushangpin',
					component: discussershoushangpinList
				},
				{
					path: 'discussershoushangpinDetail',
					component: discussershoushangpinDetail
				},
				{
					path: 'discussershoushangpinAdd',
					component: discussershoushangpinAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
