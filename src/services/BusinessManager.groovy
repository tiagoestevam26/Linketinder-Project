package services

import models.Business

class BusinessManager {
    List<Business> businesses = []

    void addBusiness(Business buss){
        businesses << buss
    }

    void listBusinesses(){
        businesses.each {it->
            println(it.toString())
        }
    }

}
