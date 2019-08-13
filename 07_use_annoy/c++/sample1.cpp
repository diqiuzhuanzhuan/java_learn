#include "diqiuzhuanzhuan_App.h"

JNIEXPORT jint JNICALL Java_diqiuzhuanzhuan_App_intMethod(JNIEnv env, jobject obj, jint number)
{
    return number + 1;
}


