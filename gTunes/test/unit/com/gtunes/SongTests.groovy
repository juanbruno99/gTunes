package com.gtunes



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Song)
class SongTests {

    void testMinimumDuration() {
       //Mock the domain class for constrains testing
		mockForConstraintsTests Song
	   
	   //Create class for testing
		def song = new Song(title:"Killer Queen", artist:"Queen",duration:0)
	   
		//Asserts it fails 
		assert !song.validate()
		
		//Check it fails on duration field constrain
		assert 'min' == song.errors['duration']
    }
}
