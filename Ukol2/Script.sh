git clone https://github.com/EduTeachers/HelloWorld.git 
cd /Users/matejzemlicka/Documents/School/OPS/2K20:21/Ukol2/HelloWorld/src/com/company
javac Main.java > compiler_out.txt 2> compiler_error.txt
cd ../../ 
java com/company/Main 2>&1 | tee runtime_out.txt
