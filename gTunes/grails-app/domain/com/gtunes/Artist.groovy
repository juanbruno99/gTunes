package com.gtunes

class Artist {
	String name

    static constraints = {
    name(blank:false)
	}
	
	static hasMany = [albums:Album]
}
