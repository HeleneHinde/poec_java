select ca.denomination_article, sum(ca.quantite) from commandes.commande co 
JOIN commandes.commande_article ca on co.numero = ca.numero_commande
where co.nom_client='N'
GROUP BY ca.denomination_article;

select ca.quantite, a.cout_ht, a.tva, 
ca.quantite * a.cout_ht * (a.tva/100+1) as total 
from commandes.commande co 
JOIN commandes.commande_article ca on co.numero = ca.numero_commande
JOIN commandes.article a on ca.denomination_article = a.denomination;

select co.nom_client, co.prenom_client, sum(COALESCE(ca.quantite,0)) as quantite, COALESCE(ca.denomination_article,'') as denomination
from commandes.client c
left join commandes.commande co on c.nom = co.nom_client and c.prenom = co.prenom_client
left JOIN commandes.commande_article ca on co.numero = ca.numero_commande
and lower(ca.denomination_article) = 'oreiller' 
GROUP BY co.nom_client, co.prenom_client, ca.denomination_article
ORDER BY quantite DESC;