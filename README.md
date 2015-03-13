Event registeration command on Wechat implemented on Mule ESB
===

Technology stack:
----------------
* Mule ESB 3.6 community
* Mongodb 3.0

Simple logic:
------------
* Subscribe subscription account
* Input 1 to register, 2 to validate and 3 to unregister
* Input xxx to check in
* Input 888 for report

Implementation:
--------------
微信实现社区活动注册签到
http://mp.weixin.qq.com/s?__biz=MzA3ODEwOTYwMQ==&mid=205523677&idx=1&sn=1c0dd5fddedf534b467af99227e3ee32&scene=4#wechat_redirect

Open issue:
----------
* no signature validation
* no wechat menu (restricted by UNAUTHARIZED subscription wechat account)
* no decent scan to register and check in (no authorized API)
* text-based, no multimedia message
* no readable name (no authorized API)
