/*
 * Copyright (C) 2016 JokAr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.jokar.rxupload.presenter.event;

import android.support.annotation.NonNull;

import com.trello.rxlifecycle2.LifecycleTransformer;

import java.io.File;

/**
 * Created by JokAr on 2017/3/7.
 */

public interface UploadPresenter {

    /**
     * 上传文件
     *
     * @param file
     * @param lifecycleTransformer
     */
    void uploadFile(File file,
                    @NonNull LifecycleTransformer lifecycleTransformer);
}