package com.bwicky.android.tesapplicationdemo

class SchoolDetails {

    private val hashMap:HashMap<String,String> = HashMap<String,String>(2)

    fun addSchoolDetails(name:String, address:String){
        hashMap.put(name,address)
    }

    fun findSchoolAddress(name: String): String {
        var address = ""
        for(key in hashMap.keys){
            if (key == name){
                address = hashMap[key].toString()
                break
            }
        }
        return address
    }
}