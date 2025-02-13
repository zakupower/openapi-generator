/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.TypeAdapter
import com.google.gson.TypeAdapterFactory
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import com.google.gson.annotations.JsonAdapter
import java.io.IOException
import com.google.gson.annotations.SerializedName

/**
 * A category for a pet
 *
 * @param id 
 * @param name 
 */


data class ApiCategory (

    @SerializedName("id")
    val id: kotlin.Long? = null,

    @SerializedName("name")
    val name: kotlin.String? = null

) {


    class CustomTypeAdapterFactory : TypeAdapterFactory {
        override fun <T> create(gson: Gson, type: TypeToken<T>): TypeAdapter<T>? {
            if (!ApiCategory::class.java.isAssignableFrom(type.rawType)) {
              return null // this class only serializes 'ApiCategory' and its subtypes
            }
            val elementAdapter = gson.getAdapter(JsonElement::class.java)
            val thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(ApiCategory::class.java))

            @Suppress("UNCHECKED_CAST")
            return object : TypeAdapter<ApiCategory>() {
                @Throws(IOException::class)
                override fun write(out: JsonWriter, value: ApiCategory) {
                    val obj = thisAdapter.toJsonTree(value).getAsJsonObject()
                    elementAdapter.write(out, obj)
                }

                @Throws(IOException::class)
                override fun read(jsonReader: JsonReader): ApiCategory  {
                    val jsonElement = elementAdapter.read(jsonReader)
                    validateJsonElement(jsonElement)
                    return thisAdapter.fromJsonTree(jsonElement)
                }
            }.nullSafe() as TypeAdapter<T>
        }
    }

    companion object {
        var openapiFields = HashSet<String>()
        var openapiRequiredFields = HashSet<String>()

        init {
            // a set of all properties/fields (JSON key names)
            openapiFields.add("id")
            openapiFields.add("name")

        }

       /**
        * Validates the JSON Element and throws an exception if issues found
        *
        * @param jsonElement JSON Element
        * @throws IOException if the JSON Element is invalid with respect to ApiCategory
        */
        @Throws(IOException::class)
        fun validateJsonElement(jsonElement: JsonElement?) {
            if (jsonElement == null) {
              require(openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                String.format("The required field(s) %s in ApiCategory is not found in the empty JSON string", ApiCategory.openapiRequiredFields.toString())
              }
            }
            val jsonObj = jsonElement!!.getAsJsonObject()
            if (jsonObj["name"] != null && !jsonObj["name"].isJsonNull) {
              require(jsonObj.get("name").isJsonPrimitive) {
                String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj["name"].toString())
              }
            }
        }
    }

}

