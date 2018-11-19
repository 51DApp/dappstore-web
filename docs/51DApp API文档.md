## 1.模糊搜索，获取搜索建议

```
GET 'tags'
```

请求参数

| 名称     | 类型   | 是否必须 | 描述                  |
| -------- | ------ | -------- | --------------------- |
| text     | string | false    | 模糊搜索用的关键字/词 |
| excluded | array  | false    | 已选中的标签          |
| type     | string | false    | 模糊搜索的类型        |

返回参数

| 名称  | 类型  | 描述     |
| ----- | ----- | -------- |
| items | array | 热门集合 |

## 2.模糊搜索，获取DApp名称

```
GET 'dapps'
```

请求参数

| 名称     | 类型   | 是否必须 | 描述                       |
| -------- | ------ | -------- | -------------------------- |
| limit    | number | false    | 限制每次查询出现的最大数量 |
| offset   | number | false    | 获取offset为0的项目        |
| tags     | array  | false    | 标签名的集合               |
| text     | string | false    | 模糊查询用的关键字/词      |
| sort     | string | false    | 限制排序字段               |
| category | string | false    | 按照标签查找对应的DApp信息 |
| order    | string | false    | 限制正序/倒序              |

返回参数

| 名称  | 类型  | 描述     |
| ----- | ----- | -------- |
| items | array | 搜索结果 |

## 3.获取特色 DApps列表

```
GET 'collections/featured'
```

返回参数

| 名称  | 类型  | 描述                       |
| ----- | ----- | -------------------------- |
| items | array | 要展示的推荐Dapp的相关信息 |

## 4.获取图片及提示

```
GET 'promoted/dapps'
```

返回参数

| 名称           | 类型  | 描述                     |
| -------------- | ----- | ------------------------ |
| imageKeyVisual | array | 带有图片及提示的相关信息 |

## 5.获取排行列表

```
GET 'categories'
```

返回参数

| 名称  | 类型  | 描述                   |
| ----- | ----- | ---------------------- |
| items | array | 获取要展示的排行的列表 |

## 6.获取特定内容的DApps列表

```
GET 'collections/list/featured'
```

返回参数

| 名称 | 类型  | 描述                              |
| ---- | ----- | --------------------------------- |
| data | array | 获取要展示的特定内容的DApps的列表 |

## 7.订阅更新信息

```
POST 'newsletter/subscribe'
```

请求参数

| 名称  | 类型   | 是否必须 | 描述                 |
| ----- | ------ | -------- | -------------------- |
| email | string | true     | 将订阅信息发送到邮箱 |

返回参数

| 名称     | 类型 | 描述         |
| -------- | ---- | ------------ |
| response | bool | 是否发送成功 |

## 8.获取特定DApp的剖面数据

```
GET 'dapps/${this.slug}/suggestions'
```

请求参数

| 名称      | 类型   | 是否必须 | 描述         |
| --------- | ------ | -------- | ------------ |
| this.slug | string | true     | DApp的slug值 |

返回参数

| 名称       | 类型   | 描述                   |
| ---------- | ------ | ---------------------- |
| score      | number | 该DApp的剖面值         |
| suggestion | array  | 除剖面值之外的其他数据 |

## 9.更新DApp相关剖面数据

```
POST 'dapps/${this.slug}/suggestions'
```

请求参数

| 名称           | 类型   | 是否必须 | 描述         |
| -------------- | ------ | -------- | ------------ |
| dapp           | string | true     | dapp的名字   |
| slug           | string | true     | dapp的slug   |
| suggesterName  | string | true     | 推荐者姓名   |
| suggesterEmail | string | true     | 推荐者邮箱   |
| platform       | string | fasle    | 所属平台     |
| this.slug      | string | true     | DApp的slug值 |

返回参数

| 名称     | 类型 | 描述         |
| -------- | ---- | ------------ |
| response | bool | 传值是否正常 |

## 10.校验用户名是否被使用

```
GET 'dapps/lookup'
```

请求参数

| 名称 | 类型   | 是否必须 | 描述           |
| ---- | ------ | -------- | -------------- |
| name | string | true     | 要验证的用户名 |

返回参数

| 名称 | 类型   | 描述                         |
| ---- | ------ | ---------------------------- |
| data | object | 这个用户名可以使用的相关信息 |

## 11.更新DApp详情

```
GET 'dapps/${this.modalProps.slug}'
```

请求参数

| 名称                 | 类型   | 是否必须 | 描述             |
| -------------------- | ------ | -------- | ---------------- |
| checkedActions       | array  | true     | 选择要执行的内容 |
| email                | string | true     | 用户的邮箱地址   |
| name                 | string | true     | 用户名           |
| dapp                 | string | true     | dapp名           |
| path                 | string | true     | 路径             |
| suggestions          | string | true     | 推荐名           |
| this.modalProps.slug | string | true     | DApp的slug名     |

返回参数

| 名称     | 类型 | 描述         |
| -------- | ---- | ------------ |
| response | bool | 传值是否正常 |

## 12.提交要推销的DApp

```
POST 'promoted/dapps'
```

请求参数

| 名称             | 类型   | 是否必须 | 描述       |
| ---------------- | ------ | -------- | ---------- |
| country          | string | true     | 国家       |
| dapp             | string | true     | dapp名字   |
| email            | string | true     | 邮箱地址   |
| name             | string | true     | 用户名     |
| hasSubmittedDapp | string | true     | 是否已提交 |

返回参数

| 名称     | 类型 | 描述         |
| -------- | ---- | ------------ |
| response | bool | 传值是否正常 |

## 13.提交预览

```
POST 'dapps'
```

请求参数

| 名称                | 类型   | 是否必须 | 描述 |
| ------------------- | ------ | -------- | ---- |
| contractsMainnet    | string | true     |      |
| contractsKovan      | string | true     |      |
| contractsRopsten    | string | true     |      |
| contractsRinkeby    | string | true     |      |
| contractsPoaMainnet | string | true     |      |
| contractsPoaTestnet | string | true     |      |
| contractsEosMainnet | string | true     |      |

返回参数

| 名称     | 类型 | 描述         |
| -------- | ---- | ------------ |
| response | bool | 传值是否正常 |

## 