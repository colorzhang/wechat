def writer = new StringWriter() 
def res = new groovy.xml.MarkupBuilder(writer) 

res.xml() { 
    ToUserName { mkp.yieldUnescaped("<![CDATA[$toUserName]]>") }
    FromUserName { mkp.yieldUnescaped("<![CDATA[$fromUserName]]>") }
    CreateTime(createTime)
    MsgType { mkp.yieldUnescaped("<![CDATA[text]]>") }
    Content { mkp.yieldUnescaped("""<![CDATA[Dear $content (your wechat OpenID) \n
        Unregister successfully. 

        hybris developer day BJ
        Date: Mar 28
        Location: Beijing

        (Input 1 to register, 2 to check status and agenda, 3 to unregister)

        ]]>""") }
}

result = writer.toString()
