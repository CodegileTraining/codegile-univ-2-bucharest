package com.codegile.univ.paul.week6.day1.problems.crud;

/**
 * Scrieti o implementare a interfetei UserCrud. Aceasta va initia o conexiune la baza de date MySQL,
 * iar cand vor fi apelate metodele expuse de interfata, ele vor opera asupra unui tabel 'users' din DB.
 * De exemplu, create(user) va crea o intrare in DB cu datele care exista pe obiectul acela de tip User,
 * get(id) va returna din DB un obiect User in care field-urile sunt completate cu datele intrarii respective
 * din DB, etc.
 * Puncte importante de atins:
 *  - Modularizare (separarea componentelor aplicatiei astfel incat fiecare operatiune - conectarea la db,
 *  parsarea obiectelor, crearea de PreparedStatement din fraze SQL  etc. - sa fie la locul potrivit)
 *  - Refolosire a codului (pe cat posibil sa nu existe cod duplicat, toate operatiunile MySQL folosesc aceeasi
 *  conexiune, aceleasi clase singleton etc.)
 *  - Cititi documentatia Javadoc de pe metodele declarate in interfata pentru mai multe detalii asupra
 *  functionarii fiecareia
 *
 * Bonus:
 *  - Sa se creeze o interfata in consola care sa citeasca de la tastatura comenzi care sa initieze actiuni
 *  asupra obiectului vostru UserCrud, de exemplu:
 *
 *   * Se printeaza in consola meniul initial si se cere un input:
 *
 *  1. Create User
 *  2. Get User By Id
 *  3. List Users
 *  4. Update User By Id
 *  5. Delete User By Id
 *
 *  Select Option: _
 *
 *   * Se introduce o optiune de la 1-5, in functie de care se afiseaza urmatorul meniu in consola,
 *   de exemplu daca se alege 1, se va printa:
 *
 *  Enter First Name: _ => Se introduce prenumele noului User, dupa care se printeaza:
 *  Enter Last Name: _ => Se introduce numele noului User, dupa care la fel pentru
 *
 *   * Daca la meniul initial se alegea optiunea 2, se printa un mesaj Enter User ID: _ si apoi s-ar fi
 *   extras din DB datele userului cu id-ul introdus si s-ar fi afisat in consola formatat corespunzator.
 *   * Daca s-ar fi ales optiunea 3, s-ar fi printat toti userii din DB.
 *   * Daca s-ar alege optiunea 4, s-ar fi cerut ID-ul, si numai daca id-ul introdus este unul valid, s-ar
 *   fi cerut noile date cu care sa fie updatat userul respectiv.
 *   * Etc.
 */
public interface UserCrud {

    /**
     * Creates a new User entity in the DB.
     *
     * @param user Data to save in the DB table's fields
     * @return User object containing all the data, complete with the newly-generated ID
     */
    User create(User user);

    /**
     * Retrieves the User corresponding to a provided ID.
     *
     * @param id ID of the User to be retrieved
     * @return User object with all the data from the User table row with that ID
     * @throws NotFoundException when the provided ID is invalid
     */
    User get(long id) throws NotFoundException;

    /**
     * Updates the User table entry corresponding to a provided ID.
     *
     * @param id ID of the User to be updated
     * @param user User object containing the new data to put in the table row
     * @return the updated User object
     * @throws NotFoundException when the provided ID is invalid
     */
    User update(long id, User user) throws NotFoundException;

    /**
     * Deletes the User table entry corresponding to a provided ID.
     *
     * @param id ID of the User to be deleted
     * @throws NotFoundException when the provided ID is invalid
     */
    void delete(long id) throws NotFoundException;
}
