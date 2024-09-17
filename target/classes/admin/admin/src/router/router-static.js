import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dangfeidengji from '@/views/modules/dangfeidengji/list'
    import dictionary from '@/views/modules/dictionary/list'
    import jiangchengjilu from '@/views/modules/jiangchengjilu/list'
    import jicengdanwei from '@/views/modules/jicengdanwei/list'
    import news from '@/views/modules/news/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zhibu from '@/views/modules/zhibu/list'
    import zhiburizhi from '@/views/modules/zhiburizhi/list'
    import zhiburongyu from '@/views/modules/zhiburongyu/list'
    import dictionaryDangfeidengji from '@/views/modules/dictionaryDangfeidengji/list'
    import dictionaryJiangchengjilu from '@/views/modules/dictionaryJiangchengjilu/list'
    import dictionaryJicengdanwei from '@/views/modules/dictionaryJicengdanwei/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryZhiburizhi from '@/views/modules/dictionaryZhiburizhi/list'
    import dictionaryZhiburongyu from '@/views/modules/dictionaryZhiburongyu/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryDangfeidengji',
        name: '是否支付',
        component: dictionaryDangfeidengji
    }
    ,{
        path: '/dictionaryJiangchengjilu',
        name: '奖惩类型',
        component: dictionaryJiangchengjilu
    }
    ,{
        path: '/dictionaryJicengdanwei',
        name: '单位类型',
        component: dictionaryJicengdanwei
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryZhiburizhi',
        name: '日志类型',
        component: dictionaryZhiburizhi
    }
    ,{
        path: '/dictionaryZhiburongyu',
        name: '荣誉类型',
        component: dictionaryZhiburongyu
    }


    ,{
        path: '/dangfeidengji',
        name: '党费登记',
        component: dangfeidengji
      }
    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/jiangchengjilu',
        name: '奖惩记录',
        component: jiangchengjilu
      }
    ,{
        path: '/jicengdanwei',
        name: '基层单位',
        component: jicengdanwei
      }
    ,{
        path: '/news',
        name: '公告',
        component: news
      }
    ,{
        path: '/yonghu',
        name: '党员',
        component: yonghu
      }
    ,{
        path: '/zhibu',
        name: '支部',
        component: zhibu
      }
    ,{
        path: '/zhiburizhi',
        name: '支部日志',
        component: zhiburizhi
      }
    ,{
        path: '/zhiburongyu',
        name: '支部荣誉',
        component: zhiburongyu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
