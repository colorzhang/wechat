def writer = new StringWriter() 
def res = new groovy.xml.MarkupBuilder(writer) 

res.xml() { 
    ToUserName { mkp.yieldUnescaped("<![CDATA[$toUserName]]>") }
    FromUserName { mkp.yieldUnescaped("<![CDATA[$fromUserName]]>") }
    CreateTime(createTime)
    MsgType { mkp.yieldUnescaped("<![CDATA[text]]>") }
    Content { mkp.yieldUnescaped("""<![CDATA[Dear $content (your wechat OpenID) \n
        Thank you for your subscription.

        We planned several hybris developer day events this year.
        1) hybris developer day BJ on Mar 28
        2) hybris developer day SH on May 9
        3) hybris developer day BJ Jun 13

        Welcome to join us!

        Register now for BJ event (Input 1 to register, 2 to check, 3 to unregister)

        ]]>""") }
}

result = writer.toString()
