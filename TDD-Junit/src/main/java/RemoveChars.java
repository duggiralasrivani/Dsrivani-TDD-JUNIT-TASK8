
public class RemoveChars {

		public String delete(String str) {
			int length=str.length();
			String op="";
			
			if(length>=2)
			{
			
				char firstpositionchar=str.charAt(0);
				char secondpositionchar=str.charAt(1);
				if(firstpositionchar=='A' && secondpositionchar=='A' && length==2)
				{
					op+="NULL";
				}
				else if(firstpositionchar=='A' && secondpositionchar=='A')
				{
					op+=str.substring(2, length);
				}
				else if(firstpositionchar=='A')
				{
					op+=str.substring(1, length);
				}
				else if(secondpositionchar=='A')
				{
					op+=firstpositionchar+str.substring(2, length);
					
				}
				else
				{
                   op+=str;
                }
			}
			return op;
		}

	}

