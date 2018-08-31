import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Ex01 from '@/components/Ex01'

Vue.use(Router)
// https://www.youtube.com/watch?reload=9&v=4lk9-PYensI
export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/ex01',
      name: 'ex01',
      component: Ex01
    }
  ]
})
