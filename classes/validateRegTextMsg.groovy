def writer = new StringWriter() 
def res = new groovy.xml.MarkupBuilder(writer) 

res.xml() { 
    ToUserName { mkp.yieldUnescaped("<![CDATA[$toUserName]]>") }
    FromUserName { mkp.yieldUnescaped("<![CDATA[$fromUserName]]>") }
    CreateTime(createTime)
    MsgType { mkp.yieldUnescaped("<![CDATA[text]]>") }
    Content { mkp.yieldUnescaped("""<![CDATA[Dear $content (your wechat OpenID) \n
        You already registered. 

        hybris developer day BJ
        Date: Mar 28
        Location: Beijing 
        Topics:
            1) xxx by 
            2) Implementation best practices, Lin Hu
            3) Search and Recommendation, Winston Zhang

        Enjoy!

        (Input 2 to check status and agenda, 3 to unregister)

        ]]>""") }
}

result = writer.toString()
