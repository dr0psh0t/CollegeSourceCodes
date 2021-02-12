package javaScreening;

public class Song
{
	private Artist thisArtist;
	private String title;
	private String album;
	private int year;
	
	public Song(String firstName, String lastName, String title, String album, int year)
	{
		this.thisArtist = new Artist(firstName, lastName);
		this.title = title;
		this.album = album;
		this.year = year;
	}
	
	public Song(String title, String album, int year)
	{
		thisArtist = new Artist();
		this.title = title;
		this.album = album;
		this.year = year;
	}
	
	public void setTitle(String title){
		this.title = title;		
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setAlbum(String album){
		this.album = album;
	}
	
	public String getAlbum(){
		return album;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public int getYear(){
		return year;
	}
	
	public String toString(){
		return title+"("+album+":"+year+")"+thisArtist.toString();
	}
}