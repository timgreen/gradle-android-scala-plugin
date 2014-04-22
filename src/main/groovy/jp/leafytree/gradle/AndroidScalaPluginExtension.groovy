/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jp.leafytree.gradle

/**
 * AndroidScalaPluginExtension has the configuration of scala.
 */
class AndroidScalaPluginExtension {
    /** scalac target option */
    public String target = "jvm-1.6"

    /** */
    public boolean runAndroidTestProguard = true

    /** */
    public File androidTestProguardFile

    /**
     * Sets scalac target option.
     *
     * @param target the scalac target option.
     */
    public void target(String target) {
        this.target = target
    }

    /**
     *
     * @param runAndroidTestProguard
     */
    public void runAndroidTestProguard(boolean runAndroidTestProguard) {
        this.runAndroidTestProguard = runAndroidTestProguard
    }

    /**
     *
     * @param androidTestProguardFile
     */
    public void androidTestProguardFile(File androidTestProguardFile) {
        this.androidTestProguardFile = androidTestProguardFile
    }
}
