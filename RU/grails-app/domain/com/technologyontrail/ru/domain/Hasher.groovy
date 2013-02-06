package com.technologyontrail.ru.domain

class Hasher {

    static constraints = {
    }
	
	String hashName
	String email
	Kennel homeKennel 
	Hasher inviteBy
	List<Kennel> visitedKennels
 
}
