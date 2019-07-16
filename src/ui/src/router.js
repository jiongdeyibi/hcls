const routers = [
    {
        path: '/',
        meta: {
            title: ''
        },
        redirect: {
            name: 'login'
        },
        component: (resolve) => require(['./views/index.vue'], resolve)
    },{
        path: '/login',
        name: '/login',
        meta: {
            title: ''
        },
        component: (resolve) => require(['./views/login.vue'], resolve)
    }
];
export default routers;