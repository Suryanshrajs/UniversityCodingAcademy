import mongoose from "mongoose";

try {
  await mongoose.connect(
    "mongodb+srv://suryanshrajs:Fs98hDmejYlnKcCz@cluster0.xp9qv.mongodb.net/classprojectdb"
  );
  console.log("Db Connection success")
} catch (error) {
    console.error("DB connection failed with error: ", error)
}
