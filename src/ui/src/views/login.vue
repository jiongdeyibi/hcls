<style scoped lang="less">
    .index{
        width: 100%;
        position: absolute;
        top: 0;
        bottom: 0;
        left: 0;
        text-align: center;
        h1{
            height: 150px;
            img{
                height: 100%;
            }
        }
        h2{
            color: #666;
            margin-bottom: 200px;
            p{
                margin: 0 0 50px;
            }
        }
        .ivu-row-flex{
            height: 100%;
        }
    }
</style>
<template>
    <div class="index">
        <Row type="flex" justify="center" align="middle">
            <Col span="24">
                <h1>
                    <img src="../images/logo.png">
                </h1>
            <Form :model="loginForm" :label-width="20"  @keydown.native.enter.prevent="submit('loginForm')">
                <FormItem>
                    <Icon type="ios-person" slot="label" size="16" />
                    <div style="position: relative">
                        <Input type="text" clearable v-model="loginForm.username"  :placeholder="aa"/>
                    </div>
                </FormItem>
                <FormItem>
                    <Icon type="ios-lock" slot="label" size="16" />
                    <Input type="password" clearable  v-model="loginForm.password"  :placeholder="bb"/>
                </FormItem>
                <FormItem prop="login">
                    <Button :loading="loading" type="primary" long @click="login">
                        {{11}}
                    </Button>
                </FormItem>
            </Form>

                    <Input v-model="username" size="large" type="text" placeholder="large size" />
                    <br>
                    <Input v-model="password" type="password" placeholder="default size" />
                <h2>
                    <p>Welcome to your iView app!</p>
                    <Button @click="login">Login</Button>
                </h2>
            </Col>
        </Row>
    </div>
</template>
<script>
    export default {
        data(){
            return{
                loginForm:{
                    username:'',
                    password:'',
                },
                username:'',
                password:'',
            }
        },
        mounted () {
            this.getUser();
        },
        methods: {
            getUser(){
                let data={};
                this.$axios.post("/api/sysUser/list",data).then(res=>{
                    console.log(res.data);
                });
            },
            login(){
                let data={
                    username:this.username,
                    password:this.password
                };
                this.$axios.post("/api/login",).then(res=>{
                    console.log(res.data);
                });
            },
            handleStart () {
                this.$Modal.info({
                    title: 'Bravo',
                    content: 'login.'
                });
            }
        }
    }
</script>
