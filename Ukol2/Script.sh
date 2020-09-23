cd /Users/matejzemlicka/Documents/School/OPS/2K20:21/Ukol2
git clone https://github.com/EduTeachers/HelloWorld.git 
cd /Users/matejzemlicka/Documents/School/OPS/2K20:21/Ukol2/HelloWorld/src/com/company
javac Main.java 2> compiler_error.txt || > compiler_out.txt
java Main
Main > compiler_out.txt 2> compiler_error.txt
cd /Users/matejzemlicka/Documents/School/OPS/2K20:21/Ukol2/HelloWorld/src
java com/company/Main 2> runtime_out.txt