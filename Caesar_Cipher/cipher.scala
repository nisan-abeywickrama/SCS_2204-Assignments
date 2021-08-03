object cipher extends App
{
    val alphabet = "abcdefghijlkmnopqrstuvwxyz";
    
    val len = alphabet.length();

    val EncryptChar = (c: Char, key: Int) => alphabet((alphabet.indexOf(c.toLower) + key) % len);
    

    val DecryptChar = (c: Char, key: Int) => if (alphabet.indexOf(c.toLower) <= key) alphabet((len + alphabet.indexOf(c.toLower) - key) % len)
                                            else alphabet((alphabet.indexOf(c.toLower) - key) % len);
       
    
    def cipher(function: (Char, Int) => Char, s: String, key: Int): String = {
        return s.map(function(_, key));
    }

    val s = "abcdefghijlkmnopqrstuvwxyz"

    val ct=cipher(EncryptChar,s,5)
    val pt=cipher(DecryptChar,ct,5)

    println(ct)
    println(pt)
}

/*
The Caesar cipher is one of the earliest known and simplest ciphers. It is a type of substitution cipher in which each letter in the plaintext 
is 'shifted' a certain number of places down the alphabet. For example, with a shift of 1, A would be replaced by B, B would become C, and so on. 
The method is named after Julius Caesar, who apparently used it to communicate with his generals.



Implement Encryption and Decryption functions of Caesar cipher.

Then implement a Cipher function which take Encryption and Decryption functions to process the data.



You answers should be uploaded to your repository.

Post the URL of your repository to the LMS.


*/

