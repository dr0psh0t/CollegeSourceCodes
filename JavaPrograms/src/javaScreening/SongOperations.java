package javaScreening;

public class SongOperations
{
	private Song[] song;
	private int maxIndex;
	private int index;
	private int indexFound;
	
	public SongOperations()
	{
		maxIndex = 7;
		index = 0;
		song = new Song[maxIndex];
		
		initializeSongs();
	}
   
   private void reposition()
   {
      Song[] newSong = new Song[7];
      
      // initialize the newly created newSong array
      for(int i = 0; i <= maxIndex - 1; i++)
			newSong[i] = new Song("", "", 0);
      
      int count = 0;
      // array storing
      for(int x = 0; x <= song.length - 1; x++)
      {
         if(!(song[x].getTitle().equals("")))
         {
            newSong[count] = song[x];
            count++;
         }   
      }
      initializeSongs();
      
      for(int x = 0; x <= newSong.length - 1; x++)
         song[x] = newSong[x];
   }
	
	public void print()
	{
		System.out.print("Song list:\n\n");
		for(int i = 0; i <= maxIndex - 1; i++)
		{
        // if(!(song[i].getTitle().equals("")))
            System.out.println(song[i].getTitle()+"\n"+song[i].getAlbum()+"\n"+song[i].getYear()+"\n");
      }
      System.out.print("\nIndex = "+(index - 1));
	}
	
	public void initializeSongs()
	{
		for(int i = 0; i <= maxIndex - 1; i++)
			song[i] = new Song("", "", 0);
	}
	
	public void addSong(String songTitle, String songAlbum, int songYear)
	{
		Song newSong = new Song(songTitle, songAlbum, songYear);
		song[index] = newSong; // this is just replacing an object song in an array index with
                             // complete fields from its default values.
      System.out.print("1 song added. Index = "+index);
		index++;
	}
	
	public boolean searchSong(String songTitle)
	{
		boolean found = false;
		int count = 0, foundIndex = 0;
		
		while(!found && count <= (maxIndex - 1))
		{
			if(song[count].getTitle().equals(songTitle))
			{
				found = true;
				indexFound = foundIndex;
			}
			foundIndex++;
			count++;
		}
		return found;
	}
   
   public int getFoundIndex(){
      return indexFound;
   }
	
	public void deleteSong(String songTitle)
	{
		if(searchSong(songTitle))
		{
			song[indexFound].setTitle("");
         song[indexFound].setAlbum("");
         song[indexFound].setYear(0);
         
         index--;
			System.out.print("1 song deleted. Index = "+index);
         reposition();
		}
		else
			System.out.print("Song is not in the list.");
	}
   
   public void displaySongByIndex(int index)
   {
      if(index <= (maxIndex - 1))
      {
         System.out.println("\n"+song[index].getTitle()+"\n"+song[index].getAlbum()+"\n"+song[index].getYear()+"\n");
         System.out.print("\nIndex = "+index);
      }   
      else
         System.out.print("\nOut of bounds.");         
   }
}