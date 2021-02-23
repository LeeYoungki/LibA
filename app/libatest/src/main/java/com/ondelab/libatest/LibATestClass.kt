package com.ondelab.libatest

import android.util.Log
import com.ondelab.testlibs.TestClass

class LibATestClass {
    fun foo(msg:String){
        Log.e("LibATestClass", "foo: $msg 그리고 호출한다 라이브러리B" )
        val test = TestClass()
        test.foo(msg)
    }
}