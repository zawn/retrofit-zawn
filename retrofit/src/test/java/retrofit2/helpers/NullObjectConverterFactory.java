/*
 * Copyright (C) 2017 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package retrofit2.helpers;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Converter;
import retrofit2.ConverterFactory;
import retrofit2.Retrofit;

/** Always converts to null. */
public final class NullObjectConverterFactory extends ConverterFactory {
  @Override public Converter<?, String> stringConverter(Type type, Annotation[] annotations,
      Retrofit retrofit) {
    return new Converter<Object, String>() {
      @Override public String convert(Object value) throws IOException {
        return null;
      }
    };
  }
}
