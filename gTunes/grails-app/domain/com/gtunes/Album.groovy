package com.gtunes

class Album {
	String title
	
    static constraints = {
    title(blank:false)
	}
	
//	static hasMany = [songs:Song]
	static belongsTo = [artist:Artist]

	static mapping = {
//		songs cascade:'delete'
	}
	
}
