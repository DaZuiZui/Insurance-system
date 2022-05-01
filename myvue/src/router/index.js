import Vue from 'vue'
import Router from 'vue-router'
import homeindex from '@/components/HelloWorld'
import myoder         from '@/components/MyOder'
import selfInsucrance from '@/components/SelfInsurance'
import PolicyMaintenance from '@/components/PolicyMaintenance'
import Login from '@/components/login'
import Reg   from '@/components/reg'
import Plist from '@/components/ProductList'
import Csa   from '@/components/Csa'
import hslpz            from '@/components/lpshz'
import Policymanagement from '@/components/PolicyManagement'
import UserManagement   from '@/components/UserManagement'
import InsuredManagement from '@/components/ManagementOfTheInsured'
import Uinsured         from  '@/components/Uinsured'
import UpdatetheUser    from '@/components/QueryTheUser'
import sqlp             from '@/components/sqlp'
import bdwh             from '@/components/bdwh'
import usqlp            from '@/components/usqlp'
import btbuser          from  '@/components/btbuser'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/admin/btbuser',
      name: 'btbuser',
      component: btbuser,
    },
    {
      path: '/admin/usqlp',
      name: 'usplp',
      component: usqlp
    },
    {
      path: '/admin/bdwh',
      name: 'bdwh',
      component: bdwh
    },
    {
      path: '/admin/sqlp',
      name: 'sqlp',
      component: sqlp,
    },
    {
      path: '/admin/UpdatetheUser',
      name: 'UpdatetheUser',
      component: UpdatetheUser,
    },
    {
      path: '/admin/Uinsured',
      name: 'Uinsured',
      component: Uinsured
    },
    {
      path: '/admin/insuredmangement',
      name: 'InsuredManagement',
      component: InsuredManagement
    },
    {
      path: '/admin/usermanagement',
      name: 'UserManagement',
      component: UserManagement
    },
    {
      path: '/admin/policymanagement',
      name: 'Policymanagement',
      component: Policymanagement
    },
    {
      path: '/user/hslpz',
      name: 'hslpz',
      component: hslpz
    },
    {
      path: '/user/csa',
      name: 'csa',
      component: Csa
    },
    {
      path: '/plist',
      name: 'plist',
      component: Plist
    },
    {
      path: '/',
      name: 'homeindex',
      component: homeindex
    },
    {
      path: '/user/myoder',
      name: 'order',
      component: myoder
    },
    {
      path: '/user/selfInsucrance',
      name: 'selfInsucrance',
      component: selfInsucrance
    },
    {
      path: '/user/PolicyMaintenance',
      name: 'oder',
      component: PolicyMaintenance
    },
    {
      path: '/user/login',
      name: 'login',
      component: Login
    },
    {
      path: '/user/reg',
      name: 'name',
      component: Reg
    }
  ]
})
