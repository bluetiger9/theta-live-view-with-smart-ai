/**
 * Copyright 2018 Ricoh Company, Ltd.
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

package io.github.bluetiger9.theta360.rescuecam.network.model.objects;

import com.google.gson.annotations.SerializedName;
import io.github.bluetiger9.theta360.rescuecam.network.model.values.Errors;

/**
 * ErrorObject
 */
public class ErrorObject {
    @SerializedName("code")
    String mCode;

    @SerializedName("message")
    String mMessage;

    public ErrorObject(Errors errors) {
        this.mCode = errors.getCode();
        this.mMessage = errors.getMessage();
    }
}
