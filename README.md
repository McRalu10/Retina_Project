# Retina_Project
NYPD Complaint Dataset Handling

Endpoints:

GET dataset/stats/total – raspunde cu un JSON care contine numarul total de evenimente din
dataset

GET dataset/stats/offenses – raspunde cu un JSON care contine numarul total de evenimente grupat
dupa coloane KY_CD

DELETE /dataset/${id} – sterge din fisierul CSV evenimentul cu ID-ul specificat (fie ca request param, fie
ca path variable) si raspunde cu true/false la succes.

POST /dataset – face post la un obiect de tipul JSON, care contine doar campurile CMPLNT_NUM,
KY_CD si insereaza la sfarsitul fisierului o linie cu acele informatii.
