# 糖糖屋超市项目（pro）

## 一、项目简介

> 一款基于`Java Swing` 图形化界面、`Mysql`数据库的超市进销存管理系统。

🌵主要的功能概况：

<img src="https://github.com/Serendipity-Hzh/TangtangWuPro/blob/main/README.assets/image-20210823094106565.png?raw=true"  />

## 二、源码层级结构

`cmd: tree / f` 

```java
`─framework`
`│  └─util`

`│          BaseTableModule.java`

`│          BillNo.java`

`│          ImagePanel.java`
`│          Item.java`
`│          JdbcUtil.java`
`│          MyFont.java`
`│          Tools.java`
`│          WindowOpacity.java`
`│`
`├─main`
`│      Entrance.java`
`│`
`└─module
    `├─dao`
    `│  │  BaseDao.java`
    `│  │`
    `│  └─Impl`
    `│          BaseDaoImpl.java`
    `│`
    `├─entity`
    `│      Category.java`
    `│      Goods.java`
    `│      StockOrder.java`
    `│      User.java`
    `│      Warehouse.java`
    `│`
    `├─services`
    `│  │  CategoryService.java`
    `│  │  GoodsService.java`
    `│  │  SaleOrderService.java`
    `│  │  StockOrderService.java`
    `│  │  UserService.java`
    `│  │  WarehouseService.java`
    `│  │`
    `│  └─Impl`
    `│          CategoryServiceImpl.java`
    `│          GoodsServiceImpl.java`
    `│          SaleOrderServiceImpl.java`
    `│          StockOrderServiceImpl.java`
    `│          UserServiceImpl.java`
    `│          WarehouseServiceImpl.java`
    `│`
    `└─view`
            `AddGoodsJFrame.java`
            `AddSaleOrderJFrame.java`
            `AddStockInputJFrame.java`
            `AddStockOutputJFrame.java`
            `AddWarehouseJFrame.java`
            `GoodsManagerJPanel.java`
            `IndexJFrame.java`
            `LoginJFrame.java`
            `ModifyGoodsJFrame.java`
            `ModifyStockInputJFrame.java`
            `ModifyStockOutputJFrame.java`
            `ModifyWarehouseJFrame.java`
            `SaleOrderManagerJPanel.java`
            `StockInputManagerJPanel.java`
            `StockOutputManagerJPanel.java`
            `UserManagerJPanel.java`
            `WarehouseManagerJPanel.java
```

## 三、项目演示Demo

> 项目使用`BeautyEye` 美化。

### 1、登录界面

![](https://github.com/Serendipity-Hzh/TangtangWuPro/blob/main/README.assets/image-20210823094409905.png?raw=true)

### 2、系统首页

![](https://github.com/Serendipity-Hzh/TangtangWuPro/blob/main/README.assets/image-20210823094458537.png?raw=true)

### 3、部分功能截图

**商品库存**

![](https://github.com/Serendipity-Hzh/TangtangWuPro/blob/main/README.assets/image-20210823094558834.png?raw=true)

**进销存管理**

![](https://github.com/Serendipity-Hzh/TangtangWuPro/blob/main/README.assets/image-20210823094633633.png?raw=true)

**用户管理**

![](https://github.com/Serendipity-Hzh/TangtangWuPro/blob/main/README.assets/image-20210823094650010.png?raw=true)

## 附录

> 🥱 交流学习使用。
