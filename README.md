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

Open issue:
----------
* no signature validation
* no wechat menu (restricted by UNAUTHARIZED subscription wechat account)
* no decent scan to register and check in (no authorized API)
* text-based, no multimedia message
* no readable name (no authorized API)

