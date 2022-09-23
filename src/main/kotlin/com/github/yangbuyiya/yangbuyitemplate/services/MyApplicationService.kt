package com.github.yangbuyiya.yangbuyitemplate.services

import com.github.yangbuyiya.yangbuyitemplate.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
