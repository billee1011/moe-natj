/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSMethodSignature;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSObject extends ObjCObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSObject(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSObject alloc();

    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("init")
    public native NSObject init();

    @Generated
    @Selector("isEqual:")
    public native boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @Selector("methodSignatureForSelector:")
    public native NSMethodSignature methodSignatureForSelector(SEL aSelector);
}
