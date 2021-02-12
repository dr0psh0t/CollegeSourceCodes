package javaScreening;

import java.util.*;

public class Test
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		SongOperations song = new SongOperations();
		int stop, songYear;
	//	song.print();
		
		try
		{
			do
			{
				System.out.print("1. add song\n2. search song\n3. delete song\n4. print all"
            +"\n5. display by index\n6. exit program\n\n");
				System.out.print("choice = ");
				int choice = console.nextInt();
			
				if(choice == 1)
				{
               String songTitle, songAlbum;
               
					System.out.print("Add song title: ");
               console.nextLine();
					songTitle = console.nextLine();
					
					System.out.print("Add song album: ");
					songAlbum = console.nextLine();             
					
					System.out.print("Add song year: ");
					songYear = console.nextInt(); 
				
					song.addSong(songTitle, songAlbum, songYear);
				}
				else if(choice == 2)
				{
					System.out.print("Search song title: ");
               console.nextLine();
					String songTitle1 = console.nextLine(); 
					if(song.searchSong(songTitle1))
						System.out.print("Song found at index["+song.getFoundIndex()+"]");
					else
						System.out.print("Song not found");
				}
				else if(choice == 3)
				{
					System.out.print("Input song title to delete: ");
               console.nextLine();
					String songTitle2 = console.nextLine(); 
					song.deleteSong(songTitle2);
				}
				else if(choice == 4)
					song.print();
            else if(choice == 5)
            {
               System.out.print("Enter the index to display: ");
               int index = console.nextInt();
               song.displaySongByIndex(index);
            }
				else if(choice == 6)
					System.exit(0);
				
				System.out.print("\n\nPress 0(zero) to exit: ");
				stop = console.nextInt();
			}
			while(stop != 0);
		}	
		catch(Exception exc){
			exc.printStackTrace();
		}
	}
}