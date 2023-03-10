### EaseRouter 

### [![](https://jitpack.io/v/gh7800/EaseRouter.svg)](https://jitpack.io/#gh7800/EaseRouter)

#### 在module中配置依赖最新版本号
```
implementation 'com.github.gh7800.EaseRouter:EaseRouter:1.0.8'
annotationProcessor 'com.github.gh7800.EaseRouter:RouterComplier:xxx'

//Activity和Fragment中使用
@Router(path = "/login/loginActivity")
public class LoginActivity extends AppCompatActivity {}

//导航
EaseRouter.getInstance().build("/login/loginActivity").navigation();
```


### 组件化/模块化项目
### ![](/Image/img_zujianhua.png)

- app为壳module,login为模块，互不依赖(模块只需依赖router-api和注解 router-complier)
- router-api 主要负责跳转导航API调用
- route-complier 和 route-annotation必须是 ***java library*** 项目

 ---

#### router-complier
- 注解处理器 java library 项目
- 主要实现注解处理器，利用APT+POET，获取注解的信息，并写入生成Java类中

#### router-annotation
- 注解 java library 项目
- 添加注解和保存注解信息的实体类

#### router-api
- 路由 module
- 路由初始化及公共api

#### login
- module
- 主要测试跳转模块

##### [推荐博客](https://blog.csdn.net/qq_24000367/article/details/121511117)
##### [借鉴 EasyRouter](https://github.com/Xiasm/EasyRouter)
