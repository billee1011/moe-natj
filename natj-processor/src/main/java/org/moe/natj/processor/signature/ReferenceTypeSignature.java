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

package org.moe.natj.processor.signature;

/**
 * Reference type signature. Either a {@link ClassTypeSignature}, {@link TypeVariableSignature} or
 * {@link ArrayTypeSignature}.
 * <p/>
 * Reference: <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.7.9.1">Signatures</a>
 */
public abstract class ReferenceTypeSignature extends JavaTypeSignature {
}
