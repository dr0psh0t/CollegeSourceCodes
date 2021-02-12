package bst;

public class BinaryTreeNode 
{
	private String word, meaning, form;
	private String classification, sentence;
	
	public BinaryTreeNode llink, rlink; // llink = leftchild. rlink = rightchild.
	
	public BinaryTreeNode()
	{
		word = meaning = form = "";
		classification = sentence = "";
		
		llink = rlink = null;
	}
	
	public BinaryTreeNode(String word, String meaning, String form,
			String classification, String sentence){
		
		this.word = word;
		this.meaning = meaning;
		this.form = form;
		this.classification = classification;
		this.sentence = sentence;
		
		llink = rlink = null;
	}
	
	// accessors
	public String getWord(){
		return word;
	}
	
	public String getMeaning(){
		return meaning;
	}
	
	public String getForm(){
		return form;
	}
	
	public String getClassification(){
		return classification;
	}
	
	public String getSentence(){
		return sentence;
	}
	
	// mutators
	public void setWord(String newWord){
		word = newWord;
	}
	
	public void setMeaning(String newMeaning){
		meaning = newMeaning;
	}
	
	public void setForm(String newForm){
		form = newForm;
	}
	
	public void setClassification(String newClassification){
		classification = newClassification;
	}
	
	public void setSentence(String newSentence){
		sentence = newSentence;
	}
	
	public String toString()
	{
		String str = "";
		str = "Word: "+word+"\nMeaning: "+meaning+"\nForm: "+form+"\nClassification: "+classification+"\nSentence: "+sentence;
		return str;
	}
}
